<template>
  <CardComponent />
</template>

<script>
import CardComponent from "@/components/card/CardComponent";

export default {
  name: "HomeView",

  components: {
    CardComponent,
  },
  methods: {
    testAppel() {
      console.log("TestMounted");
    },
  },
  mounted() {
    this.testAppel();
  },
};
</script>
