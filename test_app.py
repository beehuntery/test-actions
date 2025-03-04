# test_app.py
from app import add

def test_add():
    # 正常系のテスト: 2 + 3 は 5 になるはず
    assert add(2, 3) == 5

    # その他のテストケース
    assert add(-1, 1) == 0
    assert add(0, 0) == 0
