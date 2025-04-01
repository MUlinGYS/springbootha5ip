import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import zhuanchushenqing from '@/views/modules/zhuanchushenqing/list'
    import lishidangyuan from '@/views/modules/lishidangyuan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shenqingyijiao from '@/views/modules/shenqingyijiao/list'
    import zhibugongzuohuodong from '@/views/modules/zhibugongzuohuodong/list'
    import dangwuxinxi from '@/views/modules/dangwuxinxi/list'
    import zhibuweiyuan from '@/views/modules/zhibuweiyuan/list'
    import lishidangzhibu from '@/views/modules/lishidangzhibu/list'
    import dangfeijiaona from '@/views/modules/dangfeijiaona/list'
    import shiwushenqing from '@/views/modules/shiwushenqing/list'
    import dangzhibu from '@/views/modules/dangzhibu/list'
    import gonggao from '@/views/modules/gonggao/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/zhuanchushenqing',
        name: '转出申请',
        component: zhuanchushenqing
      }
      ,{
	path: '/lishidangyuan',
        name: '历史团员',
        component: lishidangyuan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shenqingyijiao',
        name: '申请移交',
        component: shenqingyijiao
      }
      ,{
	path: '/zhibugongzuohuodong',
        name: '支部工作活动',
        component: zhibugongzuohuodong
      }
      ,{
	path: '/dangwuxinxi',
        name: '团务信息',
        component: dangwuxinxi
      }
      ,{
	path: '/zhibuweiyuan',
        name: '支部委员',
        component: zhibuweiyuan
      }
      ,{
	path: '/lishidangzhibu',
        name: '历史团支部',
        component: lishidangzhibu
      }
      ,{
	path: '/dangfeijiaona',
        name: '团费缴纳',
        component: dangfeijiaona
      }
      ,{
	path: '/shiwushenqing',
        name: '事务申请',
        component: shiwushenqing
      }
      ,{
	path: '/dangzhibu',
        name: '团支部',
        component: dangzhibu
      }
      ,{
	path: '/gonggao',
        name: '公告',
        component: gonggao
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
