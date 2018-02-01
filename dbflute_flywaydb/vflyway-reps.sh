#!/bin/bash

cd `dirname $0`
. _project.sh

FIRST_ARG=replace-schema
SECOND_ARG=$1

export DBFLUTE_ENVIRONMENT_TYPE=vflyway

sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH $FIRST_ARG $SECOND_ARG
taskReturnCode=$?

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi
