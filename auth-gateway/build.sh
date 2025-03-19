echo "Сборка Docker контейнера.."
docker build -t auth-gateway .

echo "Тэг Docker контейнера.."
docker tag auth-gateway gazizulin24/mts_city:auth-gateway


echo "Пуш Docker контейнера.."
docker push gazizulin24/mts_city:auth-gateway