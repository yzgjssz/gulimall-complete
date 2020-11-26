<template>
  <el-tree :data="menus" :props="defaultProps" :expand-on-click-node="false" :default-expanded-keys="expandedKey" node-key="catId" show-checkbox>
    <span class="custom-tree-node" slot-scope="{ node, data }">
        <span>{{ node.label }}</span>
        <span>
          <el-button
            v-if="node.level <= 2"
            type="text"
            size="mini"
            @click="() => append(data)">
            Append
          </el-button>
          <el-button
            v-if="node.childNodes.length == 0"
            type="text"
            size="mini"
            @click="() => remove(node, data)">
            Delete
          </el-button>
        </span>
      </span>
  </el-tree>
</template>

<script type="text/ecmascript-6">
  export default {
    data () {
      return {
        menus: [],
        defaultProps: {
          children: 'children',
          label: 'name'
        },
        expandedKey: []
      }
    },
    created () {
      this.getMenus()
    },
    methods: {
      handleNodeClick (data) {
        console.log(data)
      },
      getMenus () {
        this.$http({
          url: this.$http.adornUrl('/product/category/list/tree'),
          method: 'get'
        }).then(({data}) => {
          this.menus = data.data
        })
      },
      append (data) {
        console.log('append', data)
      },
      remove (node, data) {
        var ids = [data.catId]
        this.$confirm(`是否删除当前菜单【${data.name}】?`, '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.$http({
            url: this.$http.adornUrl('/product/category/delete'),
            method: 'post',
            data: this.$http.adornData(ids, false)
          }).then(({data}) => {
            this.$message({
              type: 'success',
              message: '菜单删除成功!'
            })
            // 刷新菜单
            this.getMenus()
            // 设置需要默认展开的菜单
            this.expandedKey = [node.parent.data.catId]
          })
        }).catch(() => {})
      }
    }
  }
</script>

<style>

</style>
