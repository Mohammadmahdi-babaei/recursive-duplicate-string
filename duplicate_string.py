def is_duplicate(s):
    # Base case: empty string is duplicate
    if len(s) == 0:
        return True

    # Odd length strings cannot be divided into two equal parts
    if len(s) % 2 != 0:
        return False

    mid = len(s) // 2
    first_half = s[:mid]
    second_half = s[mid:]

    # Check if both halves are identical
    if first_half != second_half:
        return False

    # Remove the first character of the first half and recurse
    return is_duplicate(first_half[1:])


if __name__ == "__main__":
    words = [
        "ALLALL",
        "HTMMTMMHTMMTMM",
        "ALILIALILI",
        "HPOPOHPOPO",
        "POP"
    ]

    for word in words:
        print(f"{word} : {is_duplicate(word)}")
