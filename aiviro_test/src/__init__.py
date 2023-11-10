import pathlib


def get_work_dir() -> pathlib.Path:
    return pathlib.Path(__file__).parent.parent


def get_file_path(*args: str) -> pathlib.Path:
    return get_work_dir() / pathlib.Path(*args)


__all__ = ["get_work_dir", "get_file_path"]
