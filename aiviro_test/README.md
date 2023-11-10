# Aiviro Automation

## Basic repository structure
  - `requirements.txt` - contains aiviro requirement with a specified versions & all the other needed dependencies
  - `.gitignore` - ignores all irrelevant files or files containing sensitive information
  - `.pre-commit-config.yaml` - automatic code checks & formatting
  - `.gitlab-ci.yml` - defines CI configuration for GitLab server, it runs code checks based on `.pre-commit-config.yaml`
  - `flows/` - folder with Prefect flows to run Aiviro scripts
  - `images/` - folder with images used in Aiviro scripts
  - `src/` - source code of Aiviro scripts
    - `__init__.py` - contains help methods to correctly load path to files

## Environment setup

```shell
# activate python virtual environment with Aiviro installed in it
$ source venv/bin/activate

# install & initialize pre-commit for automatic code formatting
$ pip install pre-commit
$ pre-commit install
$ pre-commit run --all
```
