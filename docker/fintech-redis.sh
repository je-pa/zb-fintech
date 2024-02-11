docker network create redis-net5

docker run --name fintech-redis5 \
             -p 6379:6379 \
             --network redis-net5 \
             -d redis:latest