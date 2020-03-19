// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import VueRouter from 'vue-router'
import Main from './components/Main.vue'
import Login from './components/Login.vue'

Vue.use(VueRouter)

var router = new VueRouter({})

router.map({
  '/': {
    name: 'main',
    component: Main
  },
  '/login': {
    name: 'login',
    component: Login
  }
})

var App = Vue.extend({})
router.start(App, '#app')
