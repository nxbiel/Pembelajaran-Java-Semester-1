#include <Arduino.h>

const int buzzerPin = 8; // Sesuaikan dengan pin yang Anda pakai di rangkaian

void setup() {
pinMode(buzzerPin, OUTPUT);
}

void loop() {
  digitalWrite(buzzerPin, HIGH); // Buzzer menyala / berbunyi
  delay(1000);                  // Selama 1 detik
  digitalWrite(buzzerPin, LOW);  // Buzzer mati
  delay(1000);                  // Selama 1 detik
}