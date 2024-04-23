import React, { ChangeEvent, useState } from 'react';

interface TextAreaProps {
    message? : string;
}

const TextAreaComponent = ({message = ''}: TextAreaProps) => {
    const [text, setText] = useState<string>(message);

    const handleChange = (event: ChangeEvent<HTMLTextAreaElement>) => {
        setText(event.target.value);
    };

    return (
        <div>
            <textarea
                value={text}
                rows={10}
                cols={100}
            />
        </div>
    )
}

export default TextAreaComponent;