[English](Readme.en.md) | [Español](Readme.md)

This is a program I have created with the aim of converting words between the alphabet and Morse code, and vice versa.

Code Structure:

I have structured the code into different methods to handle the translation logic and result printing, making the code easy to understand and maintain.

Input Handling:

I have implemented input handling to ensure that user input is valid. I check if the input contains alphabetical characters or if it is already in Morse code, and provide different error messages if the input does not meet the criteria.

Translation from Words to Morse Code:

To translate words to Morse code, I iterate over each letter of the input word and look for its Morse code equivalent in the alphabetLetters array. Then, I print the corresponding Morse code, maintaining the correct structure (spaces between letters and two spaces between words).

Translation from Morse Code to Words:

To translate Morse code to words, I split the Morse code input provided by the user into individual letters and look for their equivalent in the morseCode array. Then, I print the corresponding alphabet letter, maintaining the correct structure (spaces between words).
