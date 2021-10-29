# CoffeeApp

The main idea of the project is to develop some coding skills at Kotlin as well as understand how Android Apps are built.

### What can the App do as of today?
Not so much, really. The App starts a the Login Activity in which we have a basic login form.</br>
I am using data binding to handle data so, when you fill the form will send that data to MainActivity and display it for debug purposes.
The Textview at bottom of login form takes you to Register form, yet to be designed.

### Updated as 24/10/2021
The best option that Android provides is the Single-Activity design and to not use intents.</br>
so from now on, we will be using LoginActivity as the main one and then overlap screens using Fragments.</br>
Now from LoginActivity we will going through 3 fragmens, each one containing a dropdown list (Spinner), each one containing a set of harcoded strings yet to be retrieved from a Database.

### Updated as 29/10/2021
Added some new features featuring navigation such as the Android back button, and the app's back button.</br>
As well as transfering data form the selected item on spinner to the SummaryFragment (Only form third to Summary for the time being).
As in the future the ViewModel will take that effort for us, to collect data and send it to Summary.