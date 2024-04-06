#include <Wire.h> 
#include <LiquidCrystal_I2C.h>

//I2C pins declaration
LiquidCrystal_I2C lcd(0x27, 16, 2); 

byte placeHolder[] = {
  B00000,
  B00000,
  B00000,
  B00000,
  B00000,
  B00000,
  B00000,
  B00000
};

byte emptyHeart[] = {
  B00000,
  B01010,
  B10101,
  B01010,
  B00100,
  B00000,
  B00000,
  B00000
};

byte fullHeart[] = {
  B00000,
  B01010,
  B11111,
  B01110,
  B00100,
  B00000,
  B00000,
  B00000
};

void setup() {
  lcd.begin(20, 4);
  lcd.backlight(); //light the lcd
  lcd.createChar(0, placeHolder);
  lcd.createChar(1, emptyHeart);
  lcd.createChar(2, fullHeart);
  

  lcd.clear();

  //lcd.home();
  //lcd.write(0);
}

void loop() {

  lcd.setCursor(2, 2); //position - col, row
  lcd.write((byte)0); //placeholder
  delay(1000);


  lcd.setCursor(6,1);
  lcd.print("Loading...");
  delay(1000);

  lcd.setCursor(4, 2); 
  lcd.write((byte)1); //empty heart
  delay(500);
  lcd.setCursor(6, 2); 
  lcd.write((byte)1); //empty heart
  delay(500);
  lcd.setCursor(8, 2); 
  lcd.write((byte)1); //empty heart
  delay(500);
  lcd.setCursor(10, 2); 
  lcd.write((byte)1); //empty heart
  delay(500);
  lcd.setCursor(12, 2); 
  lcd.write((byte)1); //empty heart
  delay(500);
  lcd.setCursor(14, 2); 
  lcd.write((byte)1); //empty heart
  delay(500);
  lcd.setCursor(16, 2); 
  lcd.write((byte)1); //empty heart
  delay(500);
  
  lcd.clear();

 }
