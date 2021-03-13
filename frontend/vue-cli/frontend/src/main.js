import { createApp } from "vue";
import vuetify from "./plugins/vuetify";
import App from "./App";
import router from './router'

const app = createApp(App);

app.use(vuetify);
app.use(router);
app.mount("#app");
