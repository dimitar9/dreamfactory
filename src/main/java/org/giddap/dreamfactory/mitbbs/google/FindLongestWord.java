package org.giddap.dreamfactory.mitbbs.google;

/**
 * careercup上面看到的，g得phone interiview
 * <p/>
 * Suppose you are given a dictionary of words based on an alphabet with a
 * fixed number of characters. Please write a method / function which will find
 * the longest word in the dictionary such that it can be built from
 * successively adding a single character to an existing word in the dictionary
 * (in any location). For instance, "a" -> "at" -> "cat" -> "chat" -> "chart".
 * <p/>
 * gloomyturkey (一只郁闷的火鸡) 于 (Thu Sep 15 16:21:42 2011, 美东) 提到:
 * <p/>
 * 1. 把字典按字长分进数组
 * 2. 单字 -> map[1](key, "")
 * 3. 从 i = 2 开始循环，找长度为 i, 减去一个字母后在map[i-1]的keySet里的单词，
 * 放进map[i](key, shrinked)
 * 4. 重复3，直到map[i]为空。
 * <p/>
 * 从map[i-1]任挑一个就是最长的可变化的词。英语里好象就一个解: carrousel.
 * carrousel - carousel - carouse - arouse - rouse - ruse - use - us - s
 * <p/>
 * 用本更大的字典找的：
 * complecting - completing - competing - compting - comping - coping - oping - ping - pig - pi - i
 */
public class FindLongestWord {
}
