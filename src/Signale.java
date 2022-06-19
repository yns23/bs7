class Signale {
   private boolean ablageposFrei = ?;
   private boolean produktablageErlaubt = ?;
   private boolean produktAbgelegt = ?;

   // Darauf warten, dass Signa1 auf ,true, gesetzt wird
   public synchronized void WarteAblageposFrei() throws InterruptedException {
      /* ... */
   }

   public synchronized void WarteProduktablageErlaubt() throws InterruptedException {
      /* ... */
   }

   public synchronized void WarteProduktAbgelegt() throws InterruptedException {
      /* ... */
   }

   // Signalzustand auf ,value, setzen
   public synchronized void setAblageposFrei (boolean value) {
      /* ... */
   }

   // Signalzustand auf ,value, setzen
   public synchronized void setProduktablageErlaubt(boolean value) {
      /* ... */
   }
  
   // Signalzustand auf ,value, setzen
   public synchronized void setProduktAbgelegt (boolean value) {
      /* ... */
   }
}