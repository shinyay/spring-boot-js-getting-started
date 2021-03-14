<template>
  <v-app id="app">
    <v-container>
      <!-- <v-row class="text-center">
        <v-col cols="12">
          <v-img
            :src="require('./assets/logo.svg')"
            class="my-3"
            contain
            height="200"
          />
        </v-col>
      </v-row> -->

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

          <v-list dense nav >
            <v-list-item>
              <v-list-item-title><router-link to="/list" class="linkpath">ユーザーリスト</router-link></v-list-item-title> |
            </v-list-item>
            <v-list-item>
              <v-list-item-title><router-link to="/new" class="linkpath">新規ユーザー</router-link></v-list-item-title> |
            </v-list-item>
            <v-list-item>
              <v-list-item-title><router-link to="/hello" class="linkpath">Hello World</router-link></v-list-item-title>
            </v-list-item>
          </v-list>
        </v-navigation-drawer>
      <router-view />
      </div>
    <!-- <v-main>
      <HelloWorld/>
    </v-main> -->
    </v-container>
  </v-app>
</template>

<script>
// import HelloWorld from './components/HelloWorld';

export default {
  name: 'App',

  components: {
    // HelloWorld,
  },

  data: () => ({
    //
  }),
};
</script>
<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  padding: 30px;
}
.linkpath {
  margin: 0 10px;
}
.interface {
  display: flex;
  justify-content: center;
}
</style>