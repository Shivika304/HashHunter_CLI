HashHunter CLI – A Java-based password auditing tool that automates dictionary attacks using John the Ripper.

This is the Project made for Cracking the password using ** John the Ripper ** Tool.
What this tool do:- 
  * John the Ripper (JtR) is a cybersecurity tool used to find passwords from their hashes.


ABOUT PROJECT:
  * In this project I am Creating a wordlist.txt file which stores combination of password using "" crunch ""
  * After that I have given the hashed converted password to the code as a path named "hash.txt"
  * now john the ripper will go through the wordlist.txt file and convert every possible combination into hash and compare.
  * as soon as it gets the same hash then : "The password is CRACKED"


TECHNOLOGY USED: 
	•	Java (CLI Application)
	•	John the Ripper
	•	Crunch (Wordlist Generator)
	•	Linux / macOS Terminal

  
NOTE: Use LINUX to create wordfile as : "crunch <min> <max> charset -o filename "
                          
