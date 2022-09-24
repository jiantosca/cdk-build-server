package com.jiantosca;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.constructs.Construct;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class CdkBuildServerStack extends Stack {
	public CdkBuildServerStack(final Construct scope, final String id) {
		this(scope, id, null);
	}

	public CdkBuildServerStack(final Construct scope, final String id, final StackProps props) {
		super(scope, id, props);

		/**
		 * EC2 - my api - t3.large instance type - JonsAWSKeyPair - create security
		 * group - allow ssh traffic from anywhere - 15 gb storage
		 */

		// The code that defines your stack goes here

		// example resource
		// final Queue queue = Queue.Builder.create(this, "CdkBuildServerQueue")
		// .visibilityTimeout(Duration.seconds(300))
		// .build();
	}
}
