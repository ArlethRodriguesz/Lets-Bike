# Let’s Bike! – An Interactive Ride Simulation App  

## Overview  
**Let’s Bike!** is an interactive Java-based app that simulates a virtual bike ride from Amherst, Massachusetts, to a chosen city in the United States (Denver, Seattle, San Francisco, or Atlanta).
The users answers a short series of questions to customize their journey — such as: 
- What type of bike do you want to use? (Road or electric Bike)
- How fast do you want to bike? (20, 15,10, or 5 mph)
- What color do you want your bike to be? (Orange, Red, Blue, Purple)

Once all responses are collected, an image appears that summarizes to the user's selections and details the journey summary, such as nautical mile distance the user will ride from Amherst, MA to 
their selected city, the mapped trailed mileage of their trip, and the amount of hours it will take them to bike there based on their selected speed. Then, an animation shows 
their bike moving across a scenic route ending in with an image of the destination city 

---

## scTech Stack  
- Language: Java  
- Library: 'StdDraw' - for animations
- Custom-built classes:
  - `City` handles latitude, longitude, and great-circle distance calculations.
  - `Bike` defines bike characteristics and user choices.
  - `Drawings` manages all visual and animation components using the StdDraw library.
  
---

## Demo


## Considerations for Future Iteration
- Allow for the user to select their origin city of trip and more destination cities options
- Incorporate live data such as weather API that may impact ride length
