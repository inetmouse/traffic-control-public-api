#!/usr/bin/env bash

nomad stop -yes traffic-control
nomad run -no-color scripts/nomad.hcl
