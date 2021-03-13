import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Hello from '../components/HelloWorld.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/new',
    name: 'Form',
    component: () => import('../views/UserForm.vue')
  },
  {
    path: '/list',
    name: 'List',
    component: () => import('../views/UserList.vue')
  },
  {
    path: '/hello',
    name: 'Hello',
    component: Hello
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
