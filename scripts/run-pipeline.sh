#!/usr/bin/env bash

imagename="traffic-control-public-api:$(gradle -q printVersion)"

curl "https://adm.cabonline.com/go/api/pipelines/Traffic-Control-API-Deploy-CI/schedule?variables\[IMAGE_NAME\]=$imagename&variables\[INSTANCE_COUNT\]=1" \
    --fail \
    -X POST \
    -u "$GO_USERNAME:$GO_PASSWORD" \
    -H "Confirm: true" || exit 1

