DESCRIPTION = "Recipe which will create dev image for rpi3"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
include recipes-core/images/rpi-test-image.bb
IMAGE_INSTALL:append = " main-app"
