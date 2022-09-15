<template>
  <v-img class="white--text align-end" height="200px" :src="urlImage">
    <v-card-title>{{ titleCard }}</v-card-title>
  </v-img>
</template>

<script>
export default {
  name: "ImageCardComponent",
  props: ["urlImage", "titleCard"],
  methods: {
    testAppelProps: function () {
      console.log();
    },
  },
  mounted() {
    this.testAppelProps();
  },
};
</script>

<style scoped></style>
