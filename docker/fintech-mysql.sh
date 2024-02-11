docker run -d \
--name fintech-mysql \
-e MYSQL_ROOT_PASSWORD="fintech" \
-e MYSQL_USER="fintech" \
-e MYSQL_PASSWORD="zerobase" \
-e MYSQL_DATABASE="fintech" \
-p 3307:3306 \
mysql:latest