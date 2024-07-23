DESCRIPTION = "Recipe which will create dev image for rpi3"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
include recipes-core/images/rpi-test-image.bb

ROOT_PASSWORD = "\$5\$jQTVxh7qTozSbkLT\$h7ol27iph.krJJqoZU1hpuR6aE5SYFrTOR1pANvDuvA"
PAVLE_PASSWORD = "\$5\$clj4kktuLAYS8EHL\$i.Fwo6urDNN9wPjmO80HauootYQYLdhWm6zI1rZoe7D"

inherit extrausers

EXTRA_USERS_PARAMS = " useradd -p '${PAVLE_PASSWORD}' pavle; \
                        usermod -p '${ROOT_PASSWORD}' root;"

IMAGE_INSTALL:append = " main-app"
