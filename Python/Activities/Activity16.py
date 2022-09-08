class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")
    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")
car1 = Car("Hyndai", "I10Grand", "2021", "Manual", "Gray")
car1.accelerate()
car1.stop()