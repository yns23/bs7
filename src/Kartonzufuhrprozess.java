class Kartonzufuhrprozess extends Thread {
   private Signale signale;
   
   public Kartonzufuhrprozess(Signale signale) {
      this.signale = signale;
   }

   private void fahreKartonVor() throws InterruptedException {
      sleep(1000); // Verfahrzeit bis zur Ablageposition
   }

   private void fahreKartonZurAblageposition() throws InterruptedException {
      /* Auf Signal zum Hinfahren warten */
      System.out.println("-1- Karton wird vorgefahren");
      fahreKartonVor();
      /* Relevante Signale (zurueck) setzen */
   }

   public void run() {
      while(true) {
         try {
            fahreKartonZurAblageposition();
         } catch (InterruptedException e) {
            System.out.println("Unzulaessige Unterbrechung");
            System.exit(0);
         }
      }
   }
}