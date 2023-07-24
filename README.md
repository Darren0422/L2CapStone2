# L2CapStone2
## Description 
Capstone Project is a a food delivery system for a company called “Food Quick”. Food Quick is the company that receives the orders and distributes them to a
driver based on their current load and their location.

## Importance 
This repository is important as it shows my understanding of Java and Object-oriented programming. It also provides insights to my understanding and comprehension of Java fundamentals such as classes and objects.

## Installation

To install this project locally, open the repository in your web browser: [L2CapStone2](https://github.com/Darren0422/L2CapStone2). On the repository page, click on the green "Code" button located near the top-right of the page. From the dropdown menu, select "Download ZIP". This will start the download of the repository as a ZIP file to your computer. Save it on your local storage device. 

<img width="1440" alt="Screenshot 2023-07-24 at 11 02 28" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/167174ce-171a-4daf-b5ea-2383e755bbfd">

##  Usage

You may open this file with a code editor of your choice, such as, VSCode and gain access to the written lines of code.

<img width="765" alt="Screenshot 2023-07-24 at 11 03 55" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/d73eb48c-ac4a-4930-adf3-1afc3556e258">
<img width="1027" alt="Screenshot 2023-07-24 at 11 05 01" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/3f901760-22bb-4122-8d0a-7627ca78b22d">

Run the program in you editor of choice.

<img width="1440" alt="Screenshot 2023-07-24 at 11 09 00" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/eadb49f8-b2e6-4305-9819-6981a019187a">

### Input
#### Drivers.txt
This file contains various drivers names, location and the amount of deliveries they have. 
<img width="679" alt="Screenshot 2023-07-24 at 11 11 15" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/22456f87-59b0-4266-9225-4bd1d7c92351">
#### User Prompts
Once the program runs, the user is prompted to enter various information regarding the customer, restaurant and the meal.
- Order number
- Customer name
- Contact number of the customer
- Address of the customer
- Location (city) of the customer
- Email address of the customer
- Name of the restaurant
- Location of the restaurant
- Contact number of the restaurant
- How many of each meal is being ordered
- The list of meals being ordered and their prices
- Any special preparation instructions given by the customer
- The total amount to be paid


<img width="1095" alt="Screenshot 2023-07-24 at 11 13 15" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/57ab99ae-011c-4572-8909-b214eb480701">

### Processes 
#### Customer
The Customer class is created to hold all the information pertianing to customer and create instances of the object. The Customer object is created from the inputs of the user.
<img width="1040" alt="Screenshot 2023-07-24 at 11 22 38" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/ec014a8d-1c62-489e-b04d-59b065a65127">

#### Restaurant
The Restaurant class is created to hold all the information pertianing to restaurant and create instances of the object. The Restaurant object is created from the inputs of the user.
<img width="1040" alt="Screenshot 2023-07-24 at 11 23 07" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/fba05ec3-cc19-4234-b4fc-09ea692ff650">

#### Driver
The Driver class is created to hold all the information pertianing to driver and create instances of the object. The Driver object is created from the inputs of the "Drivers.txt" file.
Additionally, There is a function selectDriver() which uses the driver location, amount of deliveries and customer location to select the most appropriate driver for the order. 
<img width="1040" alt="Screenshot 2023-07-24 at 11 22 53" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/706596b8-63fd-4986-a1b1-7f8bfe13e8fe">

#### Invoice 
The generateInvoice() method to used to created an invoice using the Customer, Restaurant and Driver objects.

#### Main
The Main Argument is used to run the program. It makes use of all inputs and created the classes to create an invoice and distribute the order to a driver based on their current load and location.
<img width="1040" alt="Screenshot 2023-07-24 at 11 23 50" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/25ce6af5-d240-402d-9789-c12412a842f6">

### Output
The program complies the information from the text file and the user prompts to complie and create a new Invoice file (invoice.txt).
<img width="679" alt="Screenshot 2023-07-24 at 11 11 31" src="https://github.com/Darren0422/L2CapStone2/assets/134398985/e1ed6457-2055-406f-a284-723b80311cdd">

## Credits
[Darren Chen](https://github.com/Darren0422)
