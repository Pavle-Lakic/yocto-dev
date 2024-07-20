# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5fffe1143de1ba9af5ef56c2f78223b9"

SRC_URI = "git://github.com/Pavle-Lakic/app.git;protocol=https;branch=main"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "7caa896e749ab08b29ff0b63f81096b98a795a7f"

S = "${WORKDIR}/git"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

# do_configure () {
# 	# Specify any needed configure commands here
# 	:
# }

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	install -d ${D}${bindir}/
	install ${S}/main ${D}${bindir}
}

TARGET_CC_ARCH += "${LDFLAGS}"