class Produktablageprozess extends Thread {
   private Signale signale;
   
   public Produktablageprozess(Signale signale) {
      this.signale = signale;
   }

   private void legeProduktAb() throws InterruptedException {
      /* Produktablage simulieren analog zum Vorfahren des Kartons */
   }

   private void legeProduktAbFallsErlaubt() throws InterruptedException {
      /* Auf Signal zum Ablegen warten */
      System.out.println("-2- Produkt wird abgelegt");
      legeProduktAb();
      /* Relevante Signale (zurueck) setzen */
   }

   public void run() {
      while (true) {
         try {
            legeProduktAbFallsErlaubt();
         } catch (InterruptedException e) {
            System.out.println("Unzulaessige Unterbrechung");
            System.exit(0);
         }
      }
   }
}