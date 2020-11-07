package leetcode

// 实现前缀树

type Trie struct {
	end      bool
	children [26]*Trie
}

func Constructor() Trie {
	return Trie{end: false}
}

func (this *Trie) Insert(word string) {
	p := this
	for _, w := range word {
		if p.children[w-'a'] == nil {
			p.children[w-'a'] = &Trie{end: false}
		}
		p = p.children[w-'a']
	}
	p.end = true
}

func (this *Trie) Search(word string) bool {
	p := this
	for _, w := range word {
		if p.children[w-'a'] == nil {
			return false
		}
		p = p.children[w-'a']
	}
	return p.end
}

func (this *Trie) StartsWith(prefix string) bool {
	p := this
	for _, w := range prefix {
		if p.children[w-'a'] == nil {
			return false
		}
		p = p.children[w-'a']
	}
	return true
}
