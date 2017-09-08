#!/bin/bash
java -cp .:mybatis-generator-core-1.3.3-SNAPSHOT-baifubao.jar org.mybatis.generator.api.ShellRunner -configfile config.xml -overwrite
