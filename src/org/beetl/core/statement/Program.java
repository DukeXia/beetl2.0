package org.beetl.core.statement;

import org.beetl.core.Context;

public class Program {
	// 模板的所有脚本语句
	public ProgramMetaData metaData = null;

	public void execute(Context ctx) {
		metaData.initContext(ctx);

		for (Statement node : metaData.statements) {
			node.run(ctx);
		}

	}

}
