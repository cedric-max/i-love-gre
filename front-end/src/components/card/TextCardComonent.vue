<template>
  <v-card-text class="text--primary">
    <div>{{ textCard }}</div>

    <div>{{ titeCard }}</div>
  </v-card-text>
</template>

<script>
export default {
  name: "TextCardComonent",
  props: ["titeCard", "textCard"],
};
</script>

<style scoped></style>
