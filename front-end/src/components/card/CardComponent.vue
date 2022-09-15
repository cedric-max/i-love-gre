<template>
  <v-container>
    <v-col cols="8">
      <v-row>
        <v-card
          v-for="card in cards"
          :key="card.id"
          class="my-4 mx-auto"
          min-width="300"
          max-width="300"
        >
          <ImageCardComponent :urlImage="card.img" />

          <v-card-subtitle class="pb-0">{{ cards.sousTitre }}</v-card-subtitle>
          <TextCardComonent
            :titeCard="card.sousTitre"
            :textCard="card.message"
          />

          <v-card-actions>
            <v-btn color="orange" text
              ><v-icon>mdi-heart</v-icon>{{ card.likes }}</v-btn
            >

            <v-btn color="orange" text
              ><v-icon>mdi-comment-multiple</v-icon
              >{{ card.commentaire.length }}</v-btn
            >
          </v-card-actions>
        </v-card>
      </v-row>
    </v-col>
  </v-container>
</template>

<script>
import ImageCardComponent from "@/components/card/ImageCardComponent";
import TextCardComonent from "@/components/card/TextCardComonent";
import CardArray from "@/ressources/CardArray";

export default {
  name: "CardComponent",
  components: {
    ImageCardComponent,
    TextCardComonent,
  },
  data() {
    return {
      cards: CardArray,
    };
  },
  props: [],
  methods: {
    testAppel() {
      console.log(CardArray);
    },
  },
  mounted() {
    this.testAppel();
  },
};
</script>

<style scoped></style>
