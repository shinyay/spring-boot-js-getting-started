<template>
  <div class="about">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
export default {
  data() {
    return {
      msg: ''
    }
  },
  mounted() {
    fetch("/api/v1/hello")
    .then((response) => response.text())
    .then((data) => {
      this.msg = data;
    });
  }
}
</script>