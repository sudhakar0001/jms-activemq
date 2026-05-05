setup the docker
run this docker run -d -p 61616:61616 -p 8161:8161 rmohr/activemq
clone the project 
change the property based on your 
run the project
hit the api http://localhost:8080/api/send?message=HelloTopic
