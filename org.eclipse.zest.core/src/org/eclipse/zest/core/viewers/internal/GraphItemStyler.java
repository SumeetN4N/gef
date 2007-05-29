/*******************************************************************************
 * Copyright 2005-2006, CHISEL Group, University of Victoria, Victoria, BC,
 * Canada. All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: The Chisel Group, University of Victoria
 ******************************************************************************/
package org.eclipse.mylar.zest.core.viewers.internal;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.mylar.zest.core.viewers.IConnectionStyleProvider;
import org.eclipse.mylar.zest.core.viewers.IEntityConnectionStyleProvider;
import org.eclipse.mylar.zest.core.viewers.IEntityStyleProvider;
import org.eclipse.mylar.zest.core.widgets.GraphConnection;
import org.eclipse.mylar.zest.core.widgets.GraphItem;
import org.eclipse.mylar.zest.core.widgets.GraphNode;
import org.eclipse.mylar.zest.core.widgets.ZestStyles;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

/**
 * Helper class used to style graph elements based on graph element stylers.
 * 
 * @author Del Myers
 * 
 */
// @tag bug(151327-Styles) : created to help resolve this bug
public class GraphItemStyler {
	public static void styleItem(GraphItem item, final IBaseLabelProvider labelProvider) {

		if (item instanceof GraphNode) {
			GraphNode node = (GraphNode) item;
			// set defaults.
			if (node.getGraphModel().getNodeStyle() != ZestStyles.NONE) {
				node.setNodeStyle(node.getGraphModel().getNodeStyle());
			} else {
				node.setNodeStyle(SWT.NONE);
			}
			Object entity = node.getData();
			if (labelProvider instanceof IEntityStyleProvider) {
				styleNode(node, (IEntityStyleProvider) labelProvider);
			}
			if (labelProvider instanceof IColorProvider) {
				IColorProvider colorProvider = (IColorProvider) labelProvider;
				node.setForegroundColor(colorProvider.getForeground(entity));
				node.setBackgroundColor(colorProvider.getBackground(entity));
			}
			if (labelProvider instanceof IFontProvider) {
				IFontProvider fontProvider = (IFontProvider) labelProvider;
				node.setFont(fontProvider.getFont(entity));
			}
			if (labelProvider instanceof ILabelProvider) {
				String text = ((ILabelProvider) labelProvider).getText(node.getData());
				node.setText((text != null) ? text : "");
				node.setImage(((ILabelProvider) labelProvider).getImage(node.getData()));
			}
		} else if (item instanceof GraphConnection) {
			GraphConnection conn = (GraphConnection) item;

			// set defaults
			if (conn.getGraphModel().getConnectionStyle() != ZestStyles.NONE) {
				int s = conn.getGraphModel().getConnectionStyle();
				conn.setConnectionStyle(s);
			} else {
				conn.setConnectionStyle(SWT.NONE);
			}
			if (labelProvider instanceof ILabelProvider) {
				String text = ((ILabelProvider) labelProvider).getText(conn.getExternalConnection());
				conn.setText((text != null) ? text : "");
				conn.setImage(((ILabelProvider) labelProvider).getImage(conn.getExternalConnection()));
			}
			if (labelProvider instanceof IEntityConnectionStyleProvider) {
				styleEntityConnection(conn, (IEntityConnectionStyleProvider) labelProvider);
			} else if (labelProvider instanceof IConnectionStyleProvider) {
				styleConnection(conn, (IConnectionStyleProvider) labelProvider);
			}
			int swt = getLineStyleForZestStyle(conn.getConnectionStyle());
			conn.setLineStyle(swt);

		}
	}

	/**
	 * @param conn
	 * @param provider
	 */
	private static void styleConnection(GraphConnection conn, IConnectionStyleProvider provider) {
		Object rel = conn.getExternalConnection();
		Color c;
		int style = provider.getConnectionStyle(rel);
		if (!ZestStyles.validateConnectionStyle(style)) {
			ZestException.throwError(ZestException.ERROR_INVALID_STYLE, "", null);
		}
		if (style != ZestStyles.NONE) {
			conn.setConnectionStyle(style);
		}
		// @tag bug(152530-Bezier(fix))
		// @tat TODO curves bezier: Add back the bezier connection stuff
		// if (ZestStyles.checkStyle(conn.getConnectionStyle(),
		// ZestStyles.CONNECTIONS_BEZIER)
		// && provider instanceof IConnectionStyleBezierExtension) {
		// IConnectionStyleBezierExtension bezier =
		// (IConnectionStyleBezierExtension) provider;
		// double d;
		// if (!Double.isNaN((d = bezier.getStartAngle(rel)))) {
		// conn.setStartAngle(d);
		// }
		// if (!Double.isNaN((d = bezier.getEndAngle(rel)))) {
		// conn.setEndAngle(d);
		// }
		// if (!Double.isNaN((d = bezier.getStartDistance(rel)))) {
		// conn.setStartLength(d);
		// }
		// if (!Double.isNaN((d = bezier.getEndDistance(rel)))) {
		// conn.setEndLength(d);
		// }
		// }
		if ((c = provider.getHighlightColor(rel)) != null) {
			conn.setHighlightColor(c);
		}
		if ((c = provider.getColor(rel)) != null) {
			conn.setLineColor(c);
		}
		IFigure tooltip;
		if ((tooltip = provider.getTooltip(rel)) != null) {
			conn.setTooltip(tooltip);
		}
		int w = -1;
		if ((w = provider.getLineWidth(rel)) >= 0) {
			conn.setLineWidth(w);
		}
	}

	/**
	 * @param conn
	 * @param provider
	 */
	private static void styleEntityConnection(GraphConnection conn, IEntityConnectionStyleProvider provider) {
		Object src = conn.getSource().getData();
		Object dest = conn.getDestination().getData();
		Color c;
		int style = provider.getConnectionStyle(src, dest);
		if (!ZestStyles.validateConnectionStyle(style)) {
			ZestException.throwError(ZestException.ERROR_INVALID_STYLE, "", null);
		}
		if (style != ZestStyles.NONE) {
			conn.setConnectionStyle(style);
		}
		// @tag bug(152530-Bezier(fisx))
		// @tag TODO curved connections bezier : add back the bezier connection stuff
		// if (ZestStyles.checkStyle(conn.getConnectionStyle(),
		// ZestStyles.CONNECTIONS_BEZIER)
		// && provider instanceof IEntityConnectionStyleBezierExtension) {
		// IEntityConnectionStyleBezierExtension bezier =
		// (IEntityConnectionStyleBezierExtension) provider;
		// double d;
		// if (!Double.isNaN((d = bezier.getStartAngle(src, dest)))) {
		// conn.setStartAngle(d);
		// }
		// if (!Double.isNaN((d = bezier.getEndAngle(src, dest)))) {
		// conn.setEndAngle(d);
		// }
		// if (!Double.isNaN((d = bezier.getStartDistance(src, dest)))) {
		// conn.setStartLength(d);
		// }
		// if (!Double.isNaN((d = bezier.getEndDistance(src, dest)))) {
		// conn.setEndLength(d);
		// }
		// }
		if ((c = provider.getColor(src, dest)) != null) {
			conn.setLineColor(c);
		}
		if ((c = provider.getHighlightColor(src, dest)) != null) {
			conn.setHighlightColor(c);
		}
		int w = -1;
		if ((w = provider.getLineWidth(src, dest)) >= 0) {
			conn.setLineWidth(w);
		}
	}

	/**
	 * Styles the given node according to the properties in the style provider.
	 * 
	 * @param node
	 *            the graph element to style.
	 * @param data
	 *            the element that is being styled.
	 * @param provider
	 *            the style provier.
	 */
	// @tag bug(151327-Styles) : resolution
	private static void styleNode(GraphNode node, IEntityStyleProvider provider) {
		Object entity = node.getData();
		node.setHighlightAdjacentNodes(provider.highlightAdjacentEntities(entity));
		if (provider.highlightAdjacentEntities(entity)) {
			Color c = provider.getAdjacentEntityHighlightColor(entity);
			if (c != null) {
				node.setHighlightAdjacentColor(c);
			}
		}
		Color c;
		IFigure figure;
		int width = -1;
		if ((c = provider.getBorderColor(entity)) != null) {
			node.setBorderColor(c);
		}
		if ((c = provider.getBorderHighlightColor(entity)) != null) {
			node.setBorderHighlightColor(c);
		}
		if ((c = provider.getNodeHighlightColor(entity)) != null) {
			node.setHighlightColor(c);
		}
		if ((c = provider.getBackgroundColour(entity)) != null) {
			node.setBackgroundColor(c);
		}
		if ((c = provider.getForegroundColour(entity)) != null) {
			node.setForegroundColor(c);
		}
		if ((width = provider.getBorderWidth(entity)) >= 0) {
			node.setBorderWidth(width);
		}
		if ((figure = provider.getTooltip(entity)) != null) {
			node.setTooltip(figure);
		}
		if ((figure = provider.getNodeFigure(entity)) != null) {
			node.setCustomFigure(figure);
		}

	}

	/**
	 * Returns the SWT line style for the given zest connection style.
	 * 
	 */
	public static int getLineStyleForZestStyle(int style) {
		int lineStyles = ZestStyles.CONNECTIONS_DASH_DOT | ZestStyles.CONNECTIONS_DASH | ZestStyles.CONNECTIONS_DOT | ZestStyles.CONNECTIONS_SOLID;
		style = style & lineStyles;
		if (style == 0) {
			style = ZestStyles.CONNECTIONS_SOLID;
		}
		switch (style) {
		case ZestStyles.CONNECTIONS_DASH_DOT:
			return SWT.LINE_DASHDOT;
		case ZestStyles.CONNECTIONS_DASH:
			return SWT.LINE_DASH;
		case ZestStyles.CONNECTIONS_DOT:
			return SWT.LINE_DOT;
		}
		return SWT.LINE_SOLID;
	}
}