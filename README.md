# BrewedBrilliance

BrewedBrilliance is a web application designed to provide users with information about various types of coffee, allowing them to purchase coffee varieties, explore famous blends, watch a video on authentic coffee preparation, and learn more about the cafe's location and background.

## About

BrewedBrilliance is your gateway to the world of coffee excellence. Located in [Cafe Location], our establishment is renowned for its dedication to delivering the finest coffee experiences. Explore our selection of premium coffee varieties, indulge in our signature blends, and immerse yourself in the art of authentic coffee preparation.

![Cafe Location](path/to/cafe/image.jpg)

## Features

- Display a variety of coffee types available for purchase.
- Showcase famous blends for users to buy and try.
- Provide a video section demonstrating authentic coffee preparation.
- About section featuring an image of the cafe location and descriptive data.

## Technologies Used

- **Frontend:**
  - HTML5
  - CSS3
  - JavaScript (ES6)
  - React.js

- **Backend:**
  - Java Spring Boot
  - MySQL

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- MySQL database installed locally or accessible online.
- Node.js and npm installed on your machine.
- Basic understanding of Java, JavaScript, HTML, and CSS.

### Installation

1. Clone the repository to your local machine:

git clone https://github.com/your-username/brewed-brilliance.git


2. Navigate to the project directory:

cd brewed-brilliance

3. Install frontend dependencies:

cd frontend
npm install


4. Install backend dependencies:

cd ../backend

## Assuming you have Maven installed
mvn install


## Running the Application

To run the application locally, follow these steps:

1. Start the backend server:

cd backend
mvn spring-boot:run


This command will start the backend server on http://localhost:8080 by default.

2. Start the frontend development server:

cd ../frontend
npm start



This command will start the frontend server on http://localhost:3000 and open the application in your default web browser.

## Frontend Development

The frontend of BrewedBrilliance is built using React.js, a popular JavaScript library for building user interfaces. All the frontend code is located in the `frontend` directory. Here are some key directories and files:

- **src/components:** Contains React components for different sections of the application.
- **src/styles:** Contains CSS files for styling the application.
- **public:** Contains static assets like images and favicon.

Feel free to explore and modify these files to customize the frontend according to your requirements.

## Backend Integration

The backend of BrewedBrilliance is built using Java Spring Boot and connects to a MySQL database. It provides RESTful APIs for fetching data related to coffee varieties, famous blends, and cafe information.

To connect the frontend with the backend and fetch data, make API requests to the endpoints defined in the Spring controllers. You can use libraries like Axios or Fetch to make HTTP requests from the frontend.

### Fetching Data from Backend with Axios

BrewedBrilliance utilizes Axios, a promise-based HTTP client for the browser and Node.js, to make requests to the backend API endpoints. Here's how you can fetch data from the backend:

1. **Import Axios:**
   
   First, ensure you have Axios installed in your project. If not, you can install it using npm:

   ```bash
   npm install axios

 Then, import Axios in your frontend component where you want to fetch data:
 # import axios from 'axios';

 ### Making GET Request:

# Use Axios to make a GET request to the backend endpoint. For example, to fetch coffee varieties:

# SampleCode: 
axios.get('http://localhost:8080/api/coffee/varieties')
  .then(response => {
    // Handle successful response
    console.log(response.data);
  })
  .catch(error => {
    // Handle error
    console.error('Error fetching data:', error);
  });

# Replace http://localhost:8080/api/coffee/varieties with the actual URL of your backend API endpoint.

### Handling Response:

 In the .then() method, you can access the response data returned by the backend. You can then manipulate or display this data in your application as needed.

# Error Handling:

 Use the .catch() method to handle any errors that may occur during the request. This ensures graceful error handling and provides feedback to the user if something goes 
 wrong.

## Example:
Let's say you want to display a list of coffee varieties on your homepage. You can create a React component to fetch and display this data:

import React, { useState, useEffect } from 'react';
import axios from 'axios';

function CoffeeVarieties() {
  const [varieties, setVarieties] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/coffee/varieties')
      .then(response => {
        setVarieties(response.data);
      })
      .catch(error => {
        console.error('Error fetching data:', error);
      });
  }, []);

  return (
    <div>
      <h2>Coffee Varieties</h2>
      <ul>
        {varieties.map(variety => (
          <li key={variety.id}>{variety.name}</li>
        ))}
      </ul>
    </div>
  );
}

export default CoffeeVarieties;

## In this example, the CoffeeVarieties component fetches data from the backend when it mounts using the useEffect hook. It then updates the component's state with the fetched data, which triggers a re-render, displaying the list of coffee varieties.

# Adjust the endpoint URL and data handling according to your backend API structure and frontend requirements.

### Contributing
Contributions to BrewedBrilliance are welcome! If you have any suggestions, bug fixes, or feature implementations, please submit a pull request. For major changes, please open an issue first to discuss the proposed changes.

# License
### This project is licensed under the MIT License - see the LICENSE file for details.

This markdown file contains all the information, including the About section at the beginning and the technical flow explained in the "Technicalities & Functionalities Involved" section. Adjust paths and specific details according to your project's structure and requirements.
