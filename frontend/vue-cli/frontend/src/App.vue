<template>
  <v-app id="app">
    <img alt="Vue logo" src="./assets/logo.png" style="width:50px;">
    <div class="interface">
      <v-navigation-drawer permanent color="transparent">
      <v-list-item>
        <v-list-item-content>
          <v-list-item-title>
            Content
          </v-list-item-title>
        </v-list-item-content>
      </v-list-item>

      <v-divider></v-divider>

      <v-list
        dense
        nav
      >
        <v-list-item>
          <v-list-item-title><router-link to="/">Home</router-link></v-list-item-title>
          <v-list-item-title><router-link to="/about">About</router-link></v-list-item-title>
          <v-list-item-title><router-link to="/list" class="linkpath">ユーザーリスト</router-link></v-list-item-title>
        </v-list-item>
        <v-list-item>
          <v-list-item-title><router-link to="/new" class="linkpath">新規ユーザー</router-link></v-list-item-title>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
    <router-view></router-view>
    </div>
  </v-app>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
