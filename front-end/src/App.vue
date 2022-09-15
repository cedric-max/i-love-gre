<template>
  <v-app>
    <v-container>
      <NavBarComponent />
    </v-container>
    <v-main>
      <v-container>
        <router-view />
      </v-container>
    </v-main>
  </v-app>
</template>

<script>
import NavBarComponent from "@/components/NavBarComponent";
export default {
  name: "App",
  components: {
    NavBarComponent,
  },

  data: () => ({
    //
  }),
};
</script>
