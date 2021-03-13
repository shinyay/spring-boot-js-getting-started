# Getting Started for Spring Boot and Vue.js Integration

Creating Vue for Frontend app and Spring Boot for Backend app

## Description
### Backend
#### Dependency
- org.springframework.boot
  - spring-boot-starter-web
  - spring-boot-starter-actuator
  - spring-boot-starter-data-jpa
- com.h2database
  - h2

#### JPA Configuration
- Entity Annotation
- [JPA Support Plugin for Kotlin](https://kotlinlang.org/docs/no-arg-plugin.html#jpa-support)

##### Entity Annotation
Spring Data JPA identify entity class with `@Entity` annotation.

```kotlin
@Entity
data class User()
```

##### JPA Support Plugin
This plugin specifies `@Entity`, `@Embeddable`, and `@MappedSuperclass` **no-arg** annotations automatically.
```
plugins {
	kotlin("plugin.jpa")
}
```

#### REST API
|METHOD|URI|Description|
|------|---|-----------|
|GET|/api/v1/users|Show All Users|
|GET|/api/v1|/users/{id}|Show a User by ID|
|POST|/api/v1/users|Create a User|
|PUT|/api/v1/users|Update a User|
|DELETE|/api/v1|/users/{id}|Delete a User by ID|

#### Test for REST API

Create User
```
$ curl -X POST -H "Content-Type: application/json" -d '{"email":"johndoe@email.com","firstName":"John", "lastName":"Doe"}' localhost:8080/api/v1/users
```

Retrieve Users
```
$ curl localhost:8080/api/v1/users
```

Update User
```
$ curl -X PUT -H "Content-Type: application/json" -d '{"id":"1", "email":"janedoe@email.com","firstName":"Jane", "lastName":"Doe"}' localhost:8080/api/v1/users
```

Delete User by ID
```
$ curl -X DELETE localhost:8080/api/v1/users/1
```

### Frontend
#### Vue CLI
##### Installation

Install Vue.js
```
$ npm install vue@next
```
```
$ npm list
vue-npm@
└── vue@3.0.5
```

Install Vue Router
```
$ npm install vue-router@next
```

Install Vue CLI
```
$ npm install -g @vue/cli
```

##### Create Project
```
$ vue create frontend
```

```
Vue CLI v4.5.11
? Please pick a preset:
  Default ([Vue 2] babel, eslint)
  Default (Vue 3 Preview) ([Vue 3] babel, eslint)
❯ Manually select features
```
```
Vue CLI v4.5.11
? Check the features needed for your project:
 ◉ Choose Vue version
 ◉ Babel
 ◯ TypeScript
 ◯ Progressive Web App (PWA) Support
❯◉ Router
 ◯ Vuex
 ◯ CSS Pre-processors
 ◉ Linter / Formatter
 ◯ Unit Testing
 ◯ E2E Testing
```
```
 Vue CLI v4.5.11
? Choose a version of Vue.js that you want to start the project with
  2.x
❯ 3.x (Preview)
```
```
Vue CLI v4.5.11
? Use history mode for router? (Requires proper server setup for index fallback in production) (Y/n) Y
```
```
Vue CLI v4.5.11
? Pick a linter / formatter config: (Use arrow keys)
❯ ESLint with error prevention only
  ESLint + Airbnb config
  ESLint + Standard config
  ESLint + Prettier
```
```
Vue CLI v4.5.11
? Pick additional lint features: (Press <space> to select, <a> to toggle all, <i> to invert selection)
❯◉ Lint on save
 ◯ Lint and fix on commit
```
```
Vue CLI v4.5.11
? Where do you prefer placing config for Babel, ESLint, etc.? (Use arrow keys)
❯ In dedicated config files
  In package.json
```
```
Vue CLI v4.5.11
? Save this as a preset for future projects? (y/N) N
```
```
⚙️  Installing CLI plugins. This might take a while...

added 1285 packages in 1m
🚀  Invoking generators...
📦  Installing additional dependencies...

added 78 packages in 7s
⚓  Running completion hooks...

📄  Generating README.md...

🎉  Successfully created project frontend.
👉  Get started with the following commands:

 $ cd frontend
 $ npm run serve
```
![vue-project](https://user-images.githubusercontent.com/3072734/111015265-47cb6f80-83eb-11eb-92aa-bb8534ab06ab.png)

##### Vuetify
```
$ cd frontend
$ vue add vuetify

? Choose a preset:
  Default (recommended)
  Prototype (rapid development)
❯ V3 (alpha)
  Configure (advanced)
```
##### Vue Configuration
`vue.config.js` is an optional config file that will be automatically loaded by `@vue/cli-service` if it's present in your project root.

- [vue.config.js](https://cli.vuejs.org/config/#vue-config-js)

|Config Options|Description|Default|
|--------------|-----------|-------|
|devServer|webpack-dev-server can be used to quickly develop an application.[Options](https://webpack.js.org/configuration/dev-server/)||
|devServer.proxy|If your frontend app and the backend API server are not running on the same host, you will need to proxy API requests to the API server during development.||
|publicPath|If your app is deployed at a sub-path, you will need to specify that sub-path using this option. For example, if your app is deployed at https://www.foo.com/my-app/, set `publicPath` to `'/my-app/'`|`/`|
|outputDir|The directory where the production build files will be generated in when running `vue-cli-service build`|`dist`|

The following configuration makes it to forward to `http://localhost:8080` when you access `http://localhost:3000/api`

```js
module.exports = {
    devServer: {
        port: 3000,
        proxy: {
            '/api': {
                target: 'http://localhost:8080',
                ws: true,
                changeOrigin: true
            }
        }
    }
}
```

##### Vue Application Main Component - App.vue
`App.vue` is a Single File Component which is main entry point.
It contains 3 chunks of code: HTML, CSS and JavaScript.

- `<template></template>` : HTML
- `<script></script>` : JavaScript
- `<style></style>` : CSS

The following script section means:
1. Load component: `import XYZ`
2. Use component: `export default {components: {XYZ}}`

```js
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
```

Then you can use component in `<template></template>`

#### Vite
##### Create Project
```
$ npm init @vitejs/app frontend

Need to install the following packages:
  @vitejs/create-app
Ok to proceed? (y) y

Scaffolding project in ...
vite/frontend...
✔ Select a template: · vue
```
```
$ cd frontend
$ npm install
$ npm run dev
```

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## References

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
