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

Install Vue CLI
```
$ npm install -g @vue/cli
```

##### Create Project
```
$ vue create frontend

📄  Generating README.md...
🎉  Successfully created project frontend.
👉  Get started with the following commands:
```
```
 $ cd frontend
 $ npm run serve
```

##### Vue Configuration
`vue.config.js` is an optional config file that will be automatically loaded by `@vue/cli-service` if it's present in your project root.

- [vue.config.js](https://cli.vuejs.org/config/#vue-config-js)

|Config Options|Description|Default|
|--------------|-----------|-------|
|devServer|webpack-dev-server can be used to quickly develop an application.[Options](https://webpack.js.org/configuration/dev-server/)||
||||
|publicPath|If your app is deployed at a sub-path, you will need to specify that sub-path using this option. For example, if your app is deployed at https://www.foo.com/my-app/, set `publicPath` to `'/my-app/'`|`/`|
|outputDir|The directory where the production build files will be generated in when running `vue-cli-service build`|`dist`|
||||
||||
||||
||||

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
