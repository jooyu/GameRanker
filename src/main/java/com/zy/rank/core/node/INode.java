package com.zy.rank.core.node;

import com.zy.rank.core.element.Element;

public interface INode {
	public Element add(Element element);
	public boolean delete(Element element);
	public int getRankValue(Element element);
}
