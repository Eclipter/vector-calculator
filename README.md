To build an image from project directory:

docker build -t bsuir/vector-calculator-impl:0.0.1 vector-calculator-impl/
docker build -t bsuir/vector-calculator-registry:0.0.1 vector-calculator-registry/
docker build -t bsuir/vector-calculator-gteway:0.0.1 vector-calculator-gateway/

To run an image:

docker run -p 8081:8080 -t bsuir/vector-calculator-impl:0.0.1
