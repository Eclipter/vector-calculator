To build an image from project directory:

docker build -t bsuir/vector-calculator:0.0.1 --build-arg JAR_FILE=target/vector-calculator-0.0.1-SNAPSHOT.jar .

To run an image:

docker run -p 8081:8080 -t bsuir/vector-calculator:0.0.1
