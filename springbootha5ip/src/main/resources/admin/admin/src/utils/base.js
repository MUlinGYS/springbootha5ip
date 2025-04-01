const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootha5ip/",
            name: "springbootha5ip",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "筠鲮团建管理系统登录"
        } 
    }
}
export default base
