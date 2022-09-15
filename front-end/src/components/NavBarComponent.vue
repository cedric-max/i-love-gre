<template>
  <v-app-bar app color="primary" dark>
    <v-toolbar-title>I love Gre <v-icon>mdi-heart</v-icon></v-toolbar-title>

    <v-spacer></v-spacer>

    <v-btn icon>
      <v-icon>mdi-home</v-icon>
    </v-btn>

    <v-btn icon>
      <v-icon>mdi-account</v-icon>
    </v-btn>

    <v-btn icon>
      <v-icon>mdi-plus-box</v-icon>
    </v-btn>

    <v-btn icon>
      <v-icon>mdi-newspaper</v-icon>
    </v-btn>
  </v-app-bar>
</template>

<script>
export default {
  name: "NavBarComponent",
};
</script>

<style scoped></style>
