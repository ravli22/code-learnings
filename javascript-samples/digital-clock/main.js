class DigitalClock{
    constructor(element){
        this.element=element;
        console.log(this.element);
        console.log(this.getTimeParts());
    }

    start(){
        this.update();
        setInterval(() => {
            this.update();
        }, 500);
    
    }

    update(){
        const parts = this.getTimeParts();
        const hoursFormatted = parts.hours;
        const minutesFormatted = parts.minutes.toString().padStart(2,"0");
        const timeFormatted = `${hoursFormatted}:${minutesFormatted}`;
        const amPm = parts.isAm ? "AM" : "PM" ;
        this.element.querySelector(".clock-time").textContent = timeFormatted;
        this.element.querySelector(".clock-ampm").textContent = amPm;

    }

    getTimeParts(){
        const now = new Date();
        
        return {
            hours: now.getHours() % 12 || 12,
            minutes: now.getMinutes(),
            isAm: now.getHours < 12
        }

    }
}

const clockElement = document.querySelector(".clock")
const clockObject = new DigitalClock(clockElement);
clockObject.start();